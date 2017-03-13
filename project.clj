(defproject github-percentile "0.1.0-SNAPSHOT"
  :description
  "If you were a Github employee, what percentile would your user ID be?"
  :url "https://github-percentile.herokuapp.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [hiccup "1.0.5"]
                 [compojure "1.5.2"]
                 [tentacles "0.5.1"]
                 [clj-http "3.4.1"]
                 [ring "1.5.1"]
                 [useful "0.8.8"]]
  :main ^:skip-aot github-percentile.core
  :target-path "target/%s"
  :uberjar-name "github-percentile-uberjar.jar"
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}
             :uberjar {:aot :all}})
