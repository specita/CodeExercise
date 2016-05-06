# CodeExercise

do some code exercises to improve code skills

from leetcode.com, qlcoder.com

# mysql query example
---

##case one
when a table like:


select * from query_test q1 where price = (select MAX(price) from query_test q2 where q1.product = q2.product);

select * from query_test q1 LEFT JOIN query_test q2 ON q1.product = q2.product AND q1.price < q2.price;