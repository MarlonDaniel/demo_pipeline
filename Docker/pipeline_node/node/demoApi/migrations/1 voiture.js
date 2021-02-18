'use strict';
module.exports = {
    up: async(queryInterface, DataTypes) => {
        await queryInterface.createTable('voiture', {
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
        });
    },
    down: async(queryInterface, Sequelize) => {
        await queryInterface.dropTable('voiture');
    }
};