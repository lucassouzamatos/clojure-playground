(ns reduce-vec)

(def prices [30 70 1000])

;; reduce the prices with the sum function
(println (reduce + prices))

(defn sum 
  [x y]
  (println x "+" y)
  (+ x y))

;; reduce the prices with the sum function
(println (reduce sum prices))

;; reduce the prices with the sum function
(println (reduce sum 0 prices)) ;; 0 is initial value for reducing
