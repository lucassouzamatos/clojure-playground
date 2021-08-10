(ns destruct)

(def request {:car { :size 2 :price 10 } :truck { :size 8 :price 10 }})

(defn print-15 [[key value]] 
  (println "key" key)
  (println "value" value)
  15)

;; (println (map print-15 request))

(defn price
  [[_ value]]
  (* (:size value) (:price value)))

;; (defn total [request]
;;   (reduce + (map price request)))
(defn total
  [request]
  (->> request ;; second arg (->>)
    (map price)
    (reduce +)))

(println (total request))