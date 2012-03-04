; An anonymous function accepting a single parameter and returns the type of the supplied value
(fn my-type [arg]
  (type arg))

; A function with arity (can be invoked with one or two parameters here)
(fn
  ([x] #{x})
  ([x, y] #{x,y}))

; Calling an anonymous function
((fn
   ([x] #{x})
   ([x, y] #{x,y})), 1,2)

; A function with a variable parameter list
(fn [x, y & z] [x,y,z])

; calling such a function
((fn [x, y & z] [x,y,z]) 1, 2, 3, :four)

; A named function
(def my-type
  (fn [arg] (type arg)))

; or a shortcut for this
(defn my-type [arg] (type arg))

; #() is a shortcut for (fn)
; % is placeholder for a parameter
(def make-a-list #(list %1 %&))
