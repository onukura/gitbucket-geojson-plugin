import gitbucket.core.controller.Context
import gitbucket.core.plugin.{RenderRequest, Renderer}
import gitbucket.core.service.RepositoryService.RepositoryInfo
import gitbucket.core.view.helpers.markdown
import play.twirl.api.Html

class GeojsonRenderer extends Renderer {

  def render(request: RenderRequest): Html = {
    import request._
    Html(toHtml(fileContent)(context))
  }

  def toHtml(fileContent: String)(implicit context: Context): String = {
    val path = context.baseUrl
    s"""
       |<link rel="stylesheet" href="https://unpkg.com/leaflet@1.6.0/dist/leaflet.css" />
       |<link rel="stylesheet" href="$path/plugin-assets/geojson/style.css" />
       |<script src="https://unpkg.com/leaflet@1.6.0/dist/leaflet.js"></script>
       |<div id="map"></div>
       |<div id="geodata" hidden>$fileContent</div>
       |<script src="$path/plugin-assets/geojson/loader.js"></script>
       |""".stripMargin

  }

  def shutdown(): Unit = {
  }

}
