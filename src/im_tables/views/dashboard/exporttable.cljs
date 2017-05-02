(ns im-tables.views.dashboard.exporttable
  (:require [re-frame.core :refer [subscribe dispatch]]
            [reagent.core :as reagent]
            [oops.core :refer [oget ocall ocall!]]
            [inflections.core :refer [plural]]
            [imcljs.path :as path :refer [walk class]]
            [im-tables.components.bootstrap :refer [modal]]))

(defn exporttable [loc]
  [:button.btn.btn-default
   {:type "button"
    :on-click
    (fn [e]
      (dispatch [:exporttable/exporttable loc]))} "Export"])
