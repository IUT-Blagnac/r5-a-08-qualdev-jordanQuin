import { Given, When, Then } from '@cucumber/cucumber';
import { expect } from 'chai';

let cucumbersInBasket = 0;

Given('I have {int} cucumbers in my basket', (initialCucumbers) => {
  cucumbersInBasket = initialCucumbers;
});

When('I eat {int} cucumbers', (cucumbersToEat) => {
  cucumbersInBasket -= cucumbersToEat;
});

Then('I should have {int} cucumbers left', (remainingCucumbers) => {
  expect(cucumbersInBasket).to.equal(remainingCucumbers);
});



$