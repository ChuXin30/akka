package ch02;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

/**
 * @author chenhao
 * @date 2023/2/5 22:53
 */
public class ActorDemo  extends UntypedActor {
    private LoggingAdapter log = Logging.getLogger(this.getContext().system() , this);

    @Override
    public void onReceive(Object msg) throws Exception {
        if(msg instanceof String){
            log.info(msg.toString());
        }else {
            unhandled(msg);
        }
    }
}
