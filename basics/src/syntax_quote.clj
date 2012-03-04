
; a syntax quote fully qualifies special forms
`(map even? [1,2,3])


; The whole expression is quoted
`(+ 10 (* 3 2))
`(+ 10 ~(* 3 2)); the expression unquoted with the tilde is evaluated though

; Just to suck the air out of you
; another version with unquote splicing
; This will inline the supplied list into the target list => (1,2,3)
(let [x '(2,3)] `(1 ~@x))

