var express = require('express');
var router = express.Router();

// controlador de voitures
const modelController = require('../controllers/voiture');

let route = '/voiture'

/* GET users listing. */
/* 
router.get('/', function(req, res, next) {
    res.send('respond with a resource');
}); */

// get list de voitures
router.get(`/list`, modelController.list);

// traer por ID
router.get(`/get/:id`, modelController.get);

// create voiture 
router.post(`/add`, modelController.create);

// delete voiture 
router.delete(`/:id`, modelController.delete);

module.exports = router;