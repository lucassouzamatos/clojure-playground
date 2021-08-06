(ns vectors)

(def prices [30 70 1000])

(println (prices 0))

;; using get function
;; if value not exists, returns nil
(println (get prices 0)) 

;; if value not exists, returns the default value passed
(println (get prices 80 9)) 

;; add value in the final, the vector is recreated
(println (conj prices 5))

;; increment the 0 value with ++
(println (update prices 0 inc)) 

;; decrement the 0 value with --
(println (update prices 0 dec)) 

;; apply fn on update
(defn sum-one
  [valor]
  (+ valor 1))

(println "sum function" (update prices 0 sum-one)) 
