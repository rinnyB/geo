package examples
import org.geotools.referencing.{CRS, GeodeticCalculator}

object Distance extends App {
  private val crs = CRS.decode("EPSG:4326") //  referencing system
  private val gc = new GeodeticCalculator(crs)
  
  val pt = closestPoints.closestPoint(primitives.square, primitives.point)
  
  gc.setStartingGeographicPoint(pt.getX(), pt.getY())
  gc.setDestinationGeographicPoint(primitives.point.getX(), primitives.point.getY())
  val distance = gc.getOrthodromicDistance
  println(distance)
}