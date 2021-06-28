;; For the first steps, it's important notice that all call functions are encapsulate for a 
;; parenthesis () and the functions has not parenthesis for parameters.
(println "Hello world!")

;; the "function" executed always has been the first argument passed in ()
(println (+ 13 3))

;; defs are "symbols" that can be similiar of variables on another languages
(def sum (+ 13 3))
(println sum)

;; vectors
(def stock ["item 1", "item 2"]) ;; can be without ; (def stock ["item 1" "item 2"])
(println stock)

;; for get a item for vector, just run as a call function
(println "stock[0]" (stock 0))
(println "stock[1]" (stock 1))

;; length about vector
(println (count stock))

;; append an element to vector
;; after conj runs: a new vector is returned but the original is immutable
(def newstock (conj stock "item 3"))
(println "newstock[2]" (newstock 2))
