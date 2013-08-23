    ;;;;
    ;;;; Autogenerated by Jack
    ;;;;
    ;;;; DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
    ;;;; 

(ns rldb.image
  (:import (com.rapleaf.jack.test_project.database_1.models Image)))

(def fields [
    :user_id
  ])


(def args (atom '()))

(defn make-evalable-constructor-call [x & more]
  (do
    (compare-and-set! args (deref args) '())
    (swap! args #(into (cons x more) %))
    `(clojure.lang.Reflector/invokeConstructor
  Image (to-array @args))))

(defn image [x & more] 
  (eval (apply make-evalable-constructor-call (cons x more))))


(defn new-default-instance [id] 
  (. Image (newDefaultInstance id)))

(defn get-user-id [image]
  (. image (getUserId)))

(defn set-field [image field value]
  (. image (setField field value)))

(defn get-field-type [image field]
  (. image (getFieldType field)))

(defn get-user [image]
  (. image (getUser)))

(defn get-field [image field]
  (. image (getField field)))

(defn has-field [field]
  (let [f (keyword field)]
    (or (= :id f) (contains? fields f))))

(defn get-default-value [image field]
  (. image (getDefaultValue field)))

(defn get-field-set [image]
  (. image (getFieldSet)))

(defn get-copy [image & db]
  (eval `(. image (getCopy ~@db))))

(defn save [image]
  (. image (save)))