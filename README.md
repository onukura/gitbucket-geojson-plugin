# gitbucket-geojson-plugin

[![Build Status](https://travis-ci.org/onukura/gitbucket-geojson-plugin.svg?branch=master)](https://travis-ci.org/onukura/gitbucket-geojson-plugin)

A GitBucket plugin for rendering GeoJSON file.

## Screenshot

![screenshot](https://github.com/onukura/gitbucket-geojson-plugin/blob/assets/screenshot.png?raw=true)


## Install

1. Download *.jar from Releases.
2. Deploy it to `GITBUCKET_HOME/plugins`.
3. Restart GitBucket.

## Build from source

```sbt
sbt clean package
```

The built package is located at
`target/scala-2.13/gitbucket-geojson-plugin_2.13-{plugin-version}.jar`.

```sbt
sbt assembly
```

This makes the assembly package
`target/scala-2.13/gitbucket-geojson-plugin-{plugin-version}.jar`
for deployment.

## Tips

You can check if your GeoJSON file is valid on [GeoJSONLint](https://geojsonlint.com/).

## Version

Plugin version|GitBucket version
:---|:---
1.0.0 |4.32.x -
