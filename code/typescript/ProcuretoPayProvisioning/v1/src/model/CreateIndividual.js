/**
 * FactSet Procure to Pay API
 * Allows for Provisioning and Entitlement of FactSet accounts.     Authentication is provided via FactSet's [API Key System](https://developer.factset.com/authentication)    Please note that the on-page \"Try it out\" features do not function. You must authorize against our API and make requests directly againt the endpoints.    
 *
 * The version of the OpenAPI document: 1S
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CreateIndividual model module.
 * @module model/CreateIndividual
 * @version 0.9.1
 */
class CreateIndividual {
    /**
     * Constructs a new <code>CreateIndividual</code>.
     * @alias module:model/CreateIndividual
     */
    constructor() { 
        
        CreateIndividual.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateIndividual</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateIndividual} obj Optional instance to populate.
     * @return {module:model/CreateIndividual} The populated <code>CreateIndividual</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateIndividual();

            if (data.hasOwnProperty('firstName')) {
                obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
            }
            if (data.hasOwnProperty('lastName')) {
                obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
            }
            if (data.hasOwnProperty('uniqueId')) {
                obj['uniqueId'] = ApiClient.convertToType(data['uniqueId'], 'String');
            }
            if (data.hasOwnProperty('roleId')) {
                obj['roleId'] = ApiClient.convertToType(data['roleId'], 'String');
            }
            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('assertionField')) {
                obj['assertionField'] = ApiClient.convertToType(data['assertionField'], 'String');
            }
            if (data.hasOwnProperty('locationId')) {
                obj['locationId'] = ApiClient.convertToType(data['locationId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} firstName
 */
CreateIndividual.prototype['firstName'] = undefined;

/**
 * @member {String} lastName
 */
CreateIndividual.prototype['lastName'] = undefined;

/**
 * A unique, constant reference to an individual/account. Used for Future management of individual.
 * @member {String} uniqueId
 */
CreateIndividual.prototype['uniqueId'] = undefined;

/**
 * @member {String} roleId
 */
CreateIndividual.prototype['roleId'] = undefined;

/**
 * @member {String} email
 */
CreateIndividual.prototype['email'] = undefined;

/**
 * A unique value passed as nameId in the SAML response
 * @member {String} assertionField
 */
CreateIndividual.prototype['assertionField'] = undefined;

/**
 * Your reference to a physical location.
 * @member {String} locationId
 */
CreateIndividual.prototype['locationId'] = undefined;






export default CreateIndividual;

