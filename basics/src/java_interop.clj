;Creating a new instance of a java class
(new java.util.HashMap { "foo" 42, "bar" 23, "baz" 13})

;or more idiomatic
(java.util.HashMap. { "foo" 42, "bar" 23, "baz" 13})

;accessing instance properties of a java instance
(.x (java.awt.Point. 10 20)) ; will read the x property

;accessing instance methods of a java instance
(.divide (java.math.BigDecimal. "42") 2M)

;setting instance properties
(let [origin (java.awt.Point. 0 0 )]
  (set! (.x origin) 15)
    (.x origin))

;method chaining
(.endsWith (.toString (java.util.Date.)) "2010")
;or with the .. macro
(.. (java.util.Date.) toString (endsWith "2010"))

;the doto macro for setting more than one property on one instance
(doto (java.util.HashMap.)
  (.put "HOME" "/home/me")
  (.put "SRC" "/src")
  (.put "Bin" "/classes"))
