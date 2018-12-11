## Fetching data from Postgres tables
- Load driver
    ```scala
    val driver = "org.postgresql.Driver"
    Class.forName(driver)
    ```

- connection
    ```scala
    val url = "http://postgres:5432/db"
    val user = "pguser"
    val password = "pgpass"
    val connection = DriverManager.getConnection(url, user, password)
    ```
- statements

```scala
val query = "select x, y from table"
val statement = connection.createStatement()
val result = statement.execute(query)
```

- iterators (load table)
We've used native Java connection, and to simplify data loading we've used Iterators.

```scala
val data = Iterator.continually((result.next(), result))
  .takeWhile(_._1)
  .map(_._2)
  .map(e => (e.getInt("x"), e.getInt("y")))
  .toMap
```