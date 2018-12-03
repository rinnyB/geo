# Table of contents
1. [Json Parsing](#Json-Parsing)
2. [Fetching data from Postgres tables](fetching-data-from-postgres-tables)
3. [Working with geography](geography)    
    3.1 [GeoTools](geotools)    
    3.2 [WellKnownText](wkt)    
    3.3 [Haversine distance](haversine-distance)    

## Json Parsing
- Play Json
    - extracting json
    - map json to case class
## Fetching data from Postgres tables
- connection
- statements
- iterators (load table)
## Geography <a name="geography"></a>
### What we do:
- calculate distances between devices
- is the point inside the polygon?
- polygon coverage
- working with projections and re-projecting data
### WKT <a name="wkt"></a>
- wkt examples
### Geotools
- reading wkt
- primitives
- find closest point on polygon
- calculate distances
- are we inside?
- reprojecting
- cutting polygons
### Haversine distance
- distance between points on a globe in KM