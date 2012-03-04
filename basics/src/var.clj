; defining a global root binding
(def global 42)
; and using it
(defn plus42 [arg] (+ global arg))

; definin localy scoped vars
(defn plus42 [arg]
  (let [x 41])
  (+ x arg))
