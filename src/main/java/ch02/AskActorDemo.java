package ch02;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.dispatch.OnSuccess;
import akka.pattern.Patterns;
import akka.util.Timeout;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

/**
 * @author chenhao
 * @date 2023/2/8 22:12
 */
public class AskActorDemo extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        System.out.println("发送者是 ： "+ getSender());
        getSender().tell("hello  " + msg.toString()  , getSelf());
    }





}
