(ns github.percentile-test
  (:require [github-percentile.core :refer [app]]
            [clojure.test :refer :all]
            [ring.mock.request :as mock]))

(deftest test-app
  (let [resp (app (mock/request :get "/"))]
    (is (= (:status resp) 200))
    (is (re-find #"Github Percentile" (:body resp)))))
