import akka.actor.{ActorSystem, Props}

/**
  * Created by mauriciofernandesdecastro on 16/11/16.
  */
object Application extends App {

  implicit val system = ActorSystem("sample")

  val helloActor = system.actorOf(Props[HelloActor])

  helloActor ! Hello
  helloActor ! GoodBye

}

