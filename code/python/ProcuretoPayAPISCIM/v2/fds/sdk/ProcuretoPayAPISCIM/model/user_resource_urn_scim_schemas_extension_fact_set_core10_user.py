"""
    FactSet SCIM API

    FactSet's SCIM API implementation.  # noqa: E501

    The version of the OpenAPI document: 2.3.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.ProcuretoPayAPISCIM.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from fds.sdk.ProcuretoPayAPISCIM.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.ProcuretoPayAPISCIM.model.federation_resource_reference import FederationResourceReference
    from fds.sdk.ProcuretoPayAPISCIM.model.location_resource_reference import LocationResourceReference
    from fds.sdk.ProcuretoPayAPISCIM.model.pending_product_order import PendingProductOrder
    from fds.sdk.ProcuretoPayAPISCIM.model.product_resource_reference import ProductResourceReference
    from fds.sdk.ProcuretoPayAPISCIM.model.user_resource_urn_scim_schemas_extension_fact_set_core10_user_user_taxonomy_data import UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData
    globals()['FederationResourceReference'] = FederationResourceReference
    globals()['LocationResourceReference'] = LocationResourceReference
    globals()['PendingProductOrder'] = PendingProductOrder
    globals()['ProductResourceReference'] = ProductResourceReference
    globals()['UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData'] = UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData


class UserResourceUrnScimSchemasExtensionFactSetCore10User(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'username': (str,),  # noqa: E501
            'serial_number': (str,),  # noqa: E501
            'unique_id': (str,),  # noqa: E501
            'location': (LocationResourceReference,),  # noqa: E501
            'user_taxonomy_data': (UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData,),  # noqa: E501
            'role_name': (str,),  # noqa: E501
            'royalty_class': (str,),  # noqa: E501
            'products': ([ProductResourceReference],),  # noqa: E501
            'pending_product_orders': ([PendingProductOrder],),  # noqa: E501
            'federations': ([FederationResourceReference],),  # noqa: E501
            'invoice_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'username': 'username',  # noqa: E501
        'serial_number': 'serialNumber',  # noqa: E501
        'unique_id': 'uniqueId',  # noqa: E501
        'location': 'location',  # noqa: E501
        'user_taxonomy_data': 'userTaxonomyData',  # noqa: E501
        'role_name': 'roleName',  # noqa: E501
        'royalty_class': 'royaltyClass',  # noqa: E501
        'products': 'products',  # noqa: E501
        'pending_product_orders': 'pendingProductOrders',  # noqa: E501
        'federations': 'federations',  # noqa: E501
        'invoice_id': 'invoiceId',  # noqa: E501
    }

    read_only_vars = {
        'serial_number',  # noqa: E501
        'unique_id',  # noqa: E501
        'pending_product_orders',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, username, *args, **kwargs):  # noqa: E501
        """UserResourceUrnScimSchemasExtensionFactSetCore10User - a model defined in OpenAPI

        Args:
            username (str): A FactSet \"username\" is FactSet's logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business.

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            serial_number (str): A serial number represents an individual's unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present.. [optional]  # noqa: E501
            unique_id (str): User identifier from the legacy User Provisioning API.. [optional]  # noqa: E501
            location (LocationResourceReference): [optional]  # noqa: E501
            user_taxonomy_data (UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData): [optional]  # noqa: E501
            role_name (str): Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber. [optional]  # noqa: E501
            royalty_class (str): Determines the type of client the individual and the royalty fee to be remitted to FactSet for the individual. Expected Royalty Class values will be provided to you by your FactSet account representative.. [optional]  # noqa: E501
            products ([ProductResourceReference]): An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them.. [optional]  # noqa: E501
            pending_product_orders ([PendingProductOrder]): An array of pending FactSet product orders.. [optional]  # noqa: E501
            federations ([FederationResourceReference]): References to the federations in which the user has at least one assertion value.. [optional]  # noqa: E501
            invoice_id (str): The identifier of the invoice that should be associated with a new user for billing purposes. Note once an invoice ID has been assigned to a user, it cannot be modified via this API. If invoice ID re-assignment is necessary, please contact your FactSet representative.. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.username = username
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, username, *args, **kwargs):  # noqa: E501
        """UserResourceUrnScimSchemasExtensionFactSetCore10User - a model defined in OpenAPI

        Args:
            username (str): A FactSet \"username\" is FactSet's logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business.

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            serial_number (str): A serial number represents an individual's unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present.. [optional]  # noqa: E501
            unique_id (str): User identifier from the legacy User Provisioning API.. [optional]  # noqa: E501
            location (LocationResourceReference): [optional]  # noqa: E501
            user_taxonomy_data (UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData): [optional]  # noqa: E501
            role_name (str): Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber. [optional]  # noqa: E501
            royalty_class (str): Determines the type of client the individual and the royalty fee to be remitted to FactSet for the individual. Expected Royalty Class values will be provided to you by your FactSet account representative.. [optional]  # noqa: E501
            products ([ProductResourceReference]): An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them.. [optional]  # noqa: E501
            pending_product_orders ([PendingProductOrder]): An array of pending FactSet product orders.. [optional]  # noqa: E501
            federations ([FederationResourceReference]): References to the federations in which the user has at least one assertion value.. [optional]  # noqa: E501
            invoice_id (str): The identifier of the invoice that should be associated with a new user for billing purposes. Note once an invoice ID has been assigned to a user, it cannot be modified via this API. If invoice ID re-assignment is necessary, please contact your FactSet representative.. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.username = username
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
