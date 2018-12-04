package examples

import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.Geometry
import org.locationtech.jts.operation.distance.DistanceOp

object closestPoints {

  def closestPoint(g1: Geometry, g2: Geometry): Coordinate = {
    val closestPointOnPolygon = DistanceOp.nearestPoints(g1, g2)(0)
    closestPointOnPolygon
  }

  def main(args: Array[String]): Unit = {
    println(closestPoint(primitives.square, primitives.point))
  }
}
  