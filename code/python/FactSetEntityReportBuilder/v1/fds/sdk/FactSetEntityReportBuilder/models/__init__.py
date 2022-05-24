# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetEntityReportBuilder.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetEntityReportBuilder.model.category import Category
from fds.sdk.FactSetEntityReportBuilder.model.category_category import CategoryCategory
from fds.sdk.FactSetEntityReportBuilder.model.currency_code import CurrencyCode
from fds.sdk.FactSetEntityReportBuilder.model.currency_code_currency_code import CurrencyCodeCurrencyCode
from fds.sdk.FactSetEntityReportBuilder.model.currency_symbol import CurrencySymbol
from fds.sdk.FactSetEntityReportBuilder.model.currency_symbol_currency_symbol import CurrencySymbolCurrencySymbol
from fds.sdk.FactSetEntityReportBuilder.model.description import Description
from fds.sdk.FactSetEntityReportBuilder.model.description_description import DescriptionDescription
from fds.sdk.FactSetEntityReportBuilder.model.error_object import ErrorObject
from fds.sdk.FactSetEntityReportBuilder.model.error_object_links import ErrorObjectLinks
from fds.sdk.FactSetEntityReportBuilder.model.error_object_source import ErrorObjectSource
from fds.sdk.FactSetEntityReportBuilder.model.error_response import ErrorResponse
from fds.sdk.FactSetEntityReportBuilder.model.frequency import Frequency
from fds.sdk.FactSetEntityReportBuilder.model.frequency_frequency import FrequencyFrequency
from fds.sdk.FactSetEntityReportBuilder.model.meta import Meta
from fds.sdk.FactSetEntityReportBuilder.model.metadata_entry import MetadataEntry
from fds.sdk.FactSetEntityReportBuilder.model.response import Response
from fds.sdk.FactSetEntityReportBuilder.model.scale import Scale
from fds.sdk.FactSetEntityReportBuilder.model.scale_scale import ScaleScale
from fds.sdk.FactSetEntityReportBuilder.model.value_type import ValueType
from fds.sdk.FactSetEntityReportBuilder.model.value_type_value_type import ValueTypeValueType
