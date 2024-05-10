package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//Условия акции
//от 0 до 1 000 рублей — скидка не предоставляется
//от 1 001 до 10 000 рублей — скидка составит 100 рублей (как в лекции)
//от 10 001 рубля и выше — скидка составит 5% от суммы.
//Все цены указаны в рублях.
//
//Те, кто приобретает музыку ежемесячно, попадают в отдельную категорию — постоянные покупатели.
// После стандартной скидки к получившейся сумме применяется дополнительная — ещё 1% сверху.

//Напишите программу, которая будет выводить в
// консоль итоговую стоимость покупки после применения скидок в зависимости от статуса покупателя (обычный или постоянный).

    val levelNoDiscountRange = 1_000
    val levelOneDiscountRange = 10_000

    val levelOneAbs = 100
    val levelTwoPersentage = 0.05;

    val statusBuyer : Boolean = true
    val statusBuyerPersentage = 0.01

    var totalAmount = 15_000

    totalAmount = if (totalAmount>levelNoDiscountRange && totalAmount<=levelOneDiscountRange) totalAmount - levelOneAbs else
        if (totalAmount>levelOneDiscountRange) (totalAmount*(1-levelTwoPersentage)).toInt() else totalAmount

    totalAmount = if(statusBuyer) (totalAmount*(1-statusBuyerPersentage)).toInt() else totalAmount


    println("Итоговая стоимость покупки после применения скидок с учетом статуса покупателя " + totalAmount)

}