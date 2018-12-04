package examples

import org.geotools.geometry.jts.JTS
import org.locationtech.jts.geom.Geometry
import org.geotools.referencing.CRS

object reprojection {
  
  def reproject(shape: Geometry, targetSRID: Int): Geometry = {
    val sourceCRS = CRS.decode("EPSG:4326")
    val targetCRS = CRS.decode(s"EPSG:$targetSRID")
    val transform = CRS.findMathTransform(sourceCRS, targetCRS, true)
    val geog: Geometry = JTS.toGeographic(shape, sourceCRS)
    JTS.transform(geog, transform)
  }

  def main(args: Array[String]): Unit = {
    val reprojected = reproject(primitives.square, 32633)
    println(reprojected)
  }
}