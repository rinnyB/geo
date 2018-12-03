package examples

import org.locationtech.jts.io.WKTReader
import org.locationtech.jts.geom.Geometry
import org.locationtech.jts.geom.LineString

object GeoExamples extends App {
    val reader = new WKTReader()

    val line = "LINESTRING (49.9935 36.2304, 50.4501 30.5234, 49.8397 24.0297)"

    val geom =  reader.read(line).asInstanceOf[LineString]

    println(geom)
    
}