

case class Point(a:Double,b:Double) {
  def x:Double=a;
  def y:Double=b;
  
  def add(p:Point)=Point(this.x+p.x,this.y+p.y);
  def move(dx:Double,dy:Double)=Point(this.x+dx,this.y+dy);
  def distance(p:Point):Double={return scala.math.sqrt(scala.math.pow((this.x-p.x), 2)+scala.math.pow((this.y-p.y), 2))}
  def invert(p: Point)  =p match{case Point(x, y) => (y, x)}
    
}