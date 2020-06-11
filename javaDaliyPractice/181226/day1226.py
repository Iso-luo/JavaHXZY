#!/usr/bin/env python
#encoding=utf-8

"""
@author: glm
@contact: xxxx@qqq.com
@software: PyCharm
@file: day1226.py
@time: 2018/12/26 14:08

人生苦短  我用python
佛祖保佑 少出bug
"""
#  用while  打印100以内所有偶数
#  的两种方法
# i=0
# while True:
#     i +=1
#     print(i)
#     if i == 100:
#         break
# print('finish')



# i=0
# while True:
#     i +=1
#     print(i)
#     if i%2==0 and i<=100:
#         print()
#         continue
# print("------------------")
#
# i=0
# while True:
#    i +=1
#    if i %2==0 :
#        print(i)
#    else:
#        continue
#    if i>100:
#        break
#
#
# i=0
# while True:
#     i += 2
#
#     if i==100:
#         break
#     print(i)


a =[2,1,4,3,6,5]

a.reverse()
print(a)

a.index()

# #升序
#
# a.sort(reverse=True)
# #[6, 5, 4, 3, 2, 1]
# x = a.pop(len(a)-1)
# print(x)
# print(a)
