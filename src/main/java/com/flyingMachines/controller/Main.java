package com.flyingMachines.controller;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Main {

    //http://www.json-generator.com/api/json/get/bUDKMdYhwy?indent=2
    public static void main(String[] args) throws JSONException {
        JSONArray json = new JSONArray("[\n" +
                "  {\n" +
                "    \"rank\": 5,\n" +
                "    \"airshipType\": \"DRONE\",\n" +
                "    \"fuelType\": \"AIR_FUEL\",\n" +
                "    \"fuelCapacity\": 27,\n" +
                "    \"categoryType\": \"PHOTOGRAPHY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"PLASTIC\",\n" +
                "      \"weight\": 38\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 952\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 944\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 987\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 202\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 183\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 541\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 791\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 999\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 10,\n" +
                "    \"airshipType\": \"SPACE_ROCKET\",\n" +
                "    \"fuelType\": \"AIR_FUEL\",\n" +
                "    \"fuelCapacity\": 4,\n" +
                "    \"categoryType\": \"COMMERCIAL\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"WOOD\",\n" +
                "      \"weight\": 960\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 891\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 114\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 204\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 995\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 821\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 677\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 50\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 396\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 872\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 8,\n" +
                "    \"airshipType\": \"JET\",\n" +
                "    \"fuelType\": \"BATTERY\",\n" +
                "    \"fuelCapacity\": 50,\n" +
                "    \"categoryType\": \"MILITARY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"TITANIUM\",\n" +
                "      \"weight\": 528\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 944\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 9\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 691\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 808\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 16\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 861\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 3,\n" +
                "    \"airshipType\": \"DRONE\",\n" +
                "    \"fuelType\": \"WATER\",\n" +
                "    \"fuelCapacity\": 32,\n" +
                "    \"categoryType\": \"MILITARY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"WOOD\",\n" +
                "      \"weight\": 436\n" +
                "    },\n" +
                "    \"propellers\": [],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 112\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 998\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 304\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 962\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 365\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 200\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 9,\n" +
                "    \"airshipType\": \"JET\",\n" +
                "    \"fuelType\": \"WATER\",\n" +
                "    \"fuelCapacity\": 34,\n" +
                "    \"categoryType\": \"MILITARY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"STEEL\",\n" +
                "      \"weight\": 853\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 508\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 655\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 971\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 363\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 524\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 471\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 95\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 728\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 465\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 96\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": []\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 1,\n" +
                "    \"airshipType\": \"HELICOPTER\",\n" +
                "    \"fuelType\": \"DIESEL\",\n" +
                "    \"fuelCapacity\": 45,\n" +
                "    \"categoryType\": \"PHOTOGRAPHY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"WOOD\",\n" +
                "      \"weight\": 870\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 175\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 860\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 802\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 713\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 556\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 408\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 447\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 5,\n" +
                "    \"airshipType\": \"SPACE_ROCKET\",\n" +
                "    \"fuelType\": \"AIR_FUEL\",\n" +
                "    \"fuelCapacity\": 34,\n" +
                "    \"categoryType\": \"PHOTOGRAPHY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"PLASTIC\",\n" +
                "      \"weight\": 967\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 668\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 400\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 66\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 100\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 27\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 829\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 896\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 321\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 824\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": []\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 1,\n" +
                "    \"airshipType\": \"JET\",\n" +
                "    \"fuelType\": \"BATTERY\",\n" +
                "    \"fuelCapacity\": 5,\n" +
                "    \"categoryType\": \"COMMERCIAL\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"STEEL\",\n" +
                "      \"weight\": 931\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 236\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 171\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 170\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 587\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 730\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 906\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"rank\": 2,\n" +
                "    \"airshipType\": \"HELICOPTER\",\n" +
                "    \"fuelType\": \"AIR_FUEL\",\n" +
                "    \"fuelCapacity\": 50,\n" +
                "    \"categoryType\": \"MILITARY\",\n" +
                "    \"cabin\": {\n" +
                "      \"materialType\": \"PLASTIC\",\n" +
                "      \"weight\": 414\n" +
                "    },\n" +
                "    \"propellers\": [\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 438\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 252\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 491\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 783\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 419\n" +
                "      }\n" +
                "    ],\n" +
                "    \"wings\": [\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 611\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 783\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"WOOD\",\n" +
                "        \"weight\": 726\n" +
                "      }\n" +
                "    ],\n" +
                "    \"rockets\": [\n" +
                "      {\n" +
                "        \"materialType\": \"TITANIUM\",\n" +
                "        \"weight\": 741\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"PLASTIC\",\n" +
                "        \"weight\": 963\n" +
                "      },\n" +
                "      {\n" +
                "        \"materialType\": \"STEEL\",\n" +
                "        \"weight\": 254\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]");
        for(int i = 0; i < json.length(); i++) {
            JSONObject objects = (JSONObject) json.get(i);

        }
    }

}
