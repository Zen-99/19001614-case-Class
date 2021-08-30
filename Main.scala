

object Main extends App{
  val p1=Point(1,2);
  val p2=Point(2,4);
  val p3=p1.add(p2);
  val p4=p1.move(2,3);
  println(p3);
  println(p4);
  println(p1.distance(p2));
  println(p1.invert(p1))
}