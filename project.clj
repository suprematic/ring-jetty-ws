(defproject inin-purecloud/ring-jetty-ws "1.0.0-SNAPSHOT"
  :description ""
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ org.eclipse.jetty.websocket/websocket-server "9.2.10.v20150310"]]
  :profiles {
    :provided {
      :dependencies [[ring/ring-jetty-adapter "1.4.0"]]}})