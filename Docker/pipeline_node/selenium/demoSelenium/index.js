const { Builder, By, Key, until } = require('selenium-webdriver');

(async function example() {
    let driver = await new Builder().forBrowser('chrome').build();
    try {
        //await driver.get('http://www.google.com/ncr');*
        await driver.get('https://www.hauts-de-seine.gouv.fr/booking/create/11681/');
        isChecked = e.findElement(By.name("condition")).Selected;

        //await driver.findElement(By.name('condition')).sendKeys('webdriver', Key.RETURN);
        await driver.wait(until.titleIs("Biométrie – Prise des empreintes digitales par suite d’une convocation préalable de la préfecture - Nanterre - Les services de l'État dans les Hauts-de-Seine"), 1000);
    } finally {
        await driver.quit();
    }
})();