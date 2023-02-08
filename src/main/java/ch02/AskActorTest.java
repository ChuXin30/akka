package ch02;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dispatch.OnSuccess;
import akka.pattern.Patterns;
import akka.util.Timeout;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

/**
 * @author chenhao
 * @date 2023/2/8 22:24
 */
public class AskActorTest {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("sys");

        ActorRef ask_ref = system.actorOf(Props.create(AskActorDemo.class) , "AskActorDemo");
        Timeout timeout = new Timeout(Duration.create(2 , "seconds"));
//        ask_ref.tell("1" , ActorRef.noSender());
        Future<Object> f = Patterns.ask(ask_ref , "Akka hello" , timeout);
        f.onSuccess(new OnSuccess<Object>() {

            @Override
            public void onSuccess(Object o) throws Throwable {
                System.out.println("收到消息 " + o.toString());
            }
        } , system.dispatcher());
        System.out.println("continue");
    }
}
