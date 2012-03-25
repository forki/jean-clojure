(ns java-interop
  (:use clojure.test))

(deftest sqrt-of-nine-is-3
  (let [expected 3.0
        actual (Math/sqrt 9)]
    (is (= expected actual))))

(run-tests)

