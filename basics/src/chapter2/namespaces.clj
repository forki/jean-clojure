;Opens up a new namespace
(ns joy.ch2)

;*ns* holds the current namespace
(defn report-ns [] (str *ns*))

;entering the symbol of this function
;will print out a fully qualified name
report-ns
;==> #<ch2$report_ns joy.ch2$report_ns@495b0e2c>

;loading a different namespace but not mapping his
;symbols ==> All imported functionality needs to be
;fully qualified
(ns joy.req
  (:require clojure.set))

(clojure.set/intersection #{1 2 3} #{3 4 5})

;The same functionality. This time using an alias
(ns joy.req-alias
  (:require [clojure.set :as s]))

(s/intersection #{1 2 3} #{3 4 5})

;Use also imports all symbols into the current namespace
;so that they don't need to be fully qualified
(ns joy.use-ex
  (:use [clojure.string :only [capitalize]]))

(map capitalize ["kilgore"])

;It's also possible to exclude a mapping with use
(ns joy.use-ex2
  (:use [clojure.string :exclude [capitalize]]))

(map capitalize ["kilgore"]);=> Will throw an exception

;Refer is like use but only uses already loaded namespaces
;It can be also used to rename a function
(ns jit.yet-another
  (:refer joy.ch2 :rename {report-ns show-ns}))

(show-ns)

;Java classes can be loaded via the import function
(ns joy.java
  (:import [java.util HashMap]
           [java.util.concurrent.atomic AtomicLong]))

(HashMap. {"happy?" true})
(AtomicLong. 42)
