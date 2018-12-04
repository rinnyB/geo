package examples

import org.locationtech.jts.io.WKTWriter
import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.geom.LineString
import org.locationtech.jts.geom.impl.CoordinateArraySequence

object wktWrite extends App {
  val factory = new GeometryFactory()    
  val dots: Array[Coordinate] = Array(
    new Coordinate(49.99, 36.23),
    new Coordinate(50.45, 30.52),
    new Coordinate(49.83, 24.02))
  val coords = new CoordinateArraySequence(dots)
  val geom = new LineString(coords, factory)

  val writer = new WKTWriter()
  val wkt = writer.write(geom)
  println(s"WKT-Encoded geometry: $wkt")
}