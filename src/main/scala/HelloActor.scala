import akka.actor.Actor


class HelloActor extends Actor {

  def receive = {
    case Hello => println("HELLO!")
    case GoodBye => println("GOOD BYE!")
    case _ => println("huh?")
  }

}