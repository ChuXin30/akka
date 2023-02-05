package ch02;

import akka.actor.*;
import akka.japi.Creator;

/**
 * @author chenhao
 * @date 2023/2/5 23:06
 */
public class PropsDemoActor extends UntypedActor {

    @Override
    public void onReceive(Object o) throws Exception {

    }

    public static Props createProps(){
        //实现creator接口并传入props.create方法
        return Props.create(new Creator<PropsDemoActor>() {
            @Override
            public PropsDemoActor create() throws Exception {
                return new PropsDemoActor();
            }
        });
    }

    public static void main(String[] args) {
        //创建actor
        ActorSystem system = ActorSystem.create("sys");
        ActorRef ref = system.actorOf(PropsDemoActor.createProps() , "propsActor");
    }

}
