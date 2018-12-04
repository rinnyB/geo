package examples

import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.geom.Geometry
import org.locationtech.jts.geom.LinearRing
import org.locationtech.jts.geom.Point
import org.locationtech.jts.geom.Polygon
import org.locationtech.jts.geom.impl.CoordinateArraySequence

object primitives {
  private val factory = new GeometryFactory()

  private val squareCoords = Array(
    new Coordinate(10, 10),
    new Coordinate(20, 10),
    new Coordinate(20, 20),
    new Coordinate(10, 20),
    new Coordinate(10, 10))
  private val squareCoordsSeq = new CoordinateArraySequence(squareCoords)
  private val squareCoordsRing = new LinearRing(squareCoordsSeq, factory)
  val square: Polygon = new Polygon(squareCoordsRing, null, factory)  

  private val pointCoords = Array(new Coordinate(25, 25))
  private val pointCoordsSeq = new CoordinateArraySequence(pointCoords)
  val point: Point = new Point(pointCoordsSeq, factory)
}