(ns maps)

(def stock { "car" 10 "motocycle" 7 })

(println (count stock)) ;; length
(println (keys stock)) ;; keys
(println (vals stock)) ;; values

;; best pratices
(def stock {:car 10 
               :motocycle 7})

(println (assoc stock :truck 1))
(println (dissoc stock :car))

(println (update stock :car inc))