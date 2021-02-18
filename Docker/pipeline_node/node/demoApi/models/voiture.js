const { Model } = require('sequelize');
module.exports = (sequelize, DataTypes) => {
    class voiture extends Model {
        static associate(models) {}
    }
    voiture.init({
        id: {
            type: DataTypes.INTEGER,
            allowNull: false,
            primaryKey: true,
            autoIncrement: true
        },
        isDeleted: {
            type: DataTypes.BOOLEAN,
            allowNull: false,
            defaultValue: 0
        },
        description: DataTypes.STRING
    }, {
        sequelize,
        timestamps: false,
        freezeTableName: true,
        modelName: 'voiture',
    });
    return voiture;
};