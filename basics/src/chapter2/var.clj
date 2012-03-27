; defining a global root binding
(def global 42)

; and using it
(defn plus42 [arg] (+ global arg))

; defining locally scoped vars
(defn plus42 [arg]
  (let [x 41])
  (+ x arg))
