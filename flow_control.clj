(if (Object.) :truthy :falsey) ; truthy
(if [] :truthy :falsey) ; truthy
(if nil :truthy :falsey) ; :falsey
(if (seq []) :truthy :falsey) ; :falsey
