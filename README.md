# Introduction

A utility which takes a string that represents a regnal date, e.g.
'1 November 10 Henry III' and convert it into a YYYY-MM-DD format,
such as '1225-10-01'.

The project creates a .jar file. The plan is to use this with
an Oxygen XML editor plugin, to speed up the marking up of 
dates in TEI/XML. 

Run the tests:

```
mvn test
```

Create the .jar file:

```
mvn package
```

Created as part of the Medieval Gold Seam 
of the [Beyond 2022 project](https://beyond2022.ie/)