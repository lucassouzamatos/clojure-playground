(def request {:car { :size 2 }
              :truck { :size 8 }})

(def new-request (assoc request :bus { :size 10 }))

(println new-request)
(println (new-request :car))
(println (get new-request :car))

(println (:car new-request)) ;; common use

(println (:size (:car new-request))) ;; common use

(println (update-in new-request [:car :size] inc))

;; threading

(println (-> new-request
  :car
  :size))

(-> new-request
  :car
  :size
  println)