(ns comp)


(def request {:car { :size 2 :price 10 } 
              :truck { :size 8 :price 10 }
              :bus { :size 8 }})

(defn free?
  [value]
  (<= (get value :price 0) 0))

(println (filter #(free? (second %)) request)) ;; get value each of item by lambda fn

(defn non-free
  [value]
  (not (free? value)))

(def non-free? (comp not free?))
(println (filter #(non-free? (second %)) request)) ;; get value each of item by lambda fn
