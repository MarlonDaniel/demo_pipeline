const Sequelize = require('sequelize');
const model = require('../models').voiture;

const Op = Sequelize.Op;
const _ = require('lodash');

module.exports = {
    create(req, res) {
        //console.log(req.body.description);
        return model
            .create({
                description: req.body.description
            })
            .then(result => res.status(200).send(result))
            .catch(error => res.status(400).send(error))
    },
    delete(req, res) {
        console.log("LOG voiture.js - en el controller delete: " + req.params.id);
        model.findByPk(req.params.id)
        let id = req.params.id;
        let body = _.pick(req.body);
        body.isDeleted = 1;
        console.log("LOG voiture.js - en el controller delete, description: " + body.description);
        return model.update(
                body, { where: { id: req.params.id } })
            .then(result => res.status(200).send(result))
            .catch(error => res.status(400).send(error))
    },
    get(req, res) {
        console.log("LOG voiture.js - en el controller get: " + req.params.id);
        return model.findByPk(req.params.id)
            .then(result => res.status(200).send(result))
            .catch(error => res.status(400).send(error))
    },
    list(req, res) {
        console.log("LOG voiture.js - en el controller list: " + req.params.id);
        //let bodyId = req.body.id == undefined ? '' : req.body.id;
        return model.findAll({
                where: {
                    isDeleted: {
                        [Op.eq]: 0
                    }
                }
            })
            .then(result => res.status(200).send(result))
            .catch(error => {
                console.log("error", error);
                res.status(400).send(error)
            })
    }

};