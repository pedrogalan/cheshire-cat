(defproject cheshire-cat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :repl-options {:init-ns cheshire-cat.handler}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.5.0"]
                 [org.clojure/clojurescript "1.10.597"]
                 [proto-repl "0.3.1"]
                 [cljs-http "0.1.46"]
                 [org.clojure/core.async "1.1.587"]
                 [enfocus "2.1.1"]]
  :plugins [[lein-ring "0.12.5"]
            [lein-cljsbuild "1.1.8"]]
  :ring {:handler cheshire-cat.handler/app}
  :profiles
    {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}}
  :cljsbuild {
    :builds [{
      :source-paths ["src-cljs"]
      :compiler {
        :output-to "resources/public/main.js"
        :optimizations :whitespace
        :pretty-print true}}]})
