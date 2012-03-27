(ns chapter3.truth
  (:use clojure.test))

(deftest should-all-be-true
   (doseq [x '("true" 0 -1 true [])]
     (is (true? (boolean x)))))

(deftest should-all-be-false
  (doseq [x '(nil false)]
    (is (false? (boolean x)))))

(run-tests)

