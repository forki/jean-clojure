
; Vector / PersistentVector
[1, 2 , :three, "4"]

; List / PersistentList (quoted, so that the first argument
; is not evaluated as a function call
'(1, 2, 3 , 4)
(quote (1, 2, 3 , 4))

; Map / PersistentArrayMap
(:key1 "value1", :key2 "value2" )

; Set / PersistentHashSet
#{1, 2, 3 , :four}

; Function call
(keys { :key1 "value1", :key2 "value2" })

