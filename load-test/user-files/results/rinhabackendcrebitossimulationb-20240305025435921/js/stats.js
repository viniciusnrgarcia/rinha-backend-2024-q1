var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name--1146707516",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "26",
        "ok": "25",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "3",
        "ok": "12",
        "ko": "3"
    },
    "maxResponseTime": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "meanResponseTime": {
        "total": "28",
        "ok": "29",
        "ko": "3"
    },
    "standardDeviation": {
        "total": "11",
        "ok": "9",
        "ko": "0"
    },
    "percentiles1": {
        "total": "35",
        "ok": "35",
        "ko": "3"
    },
    "percentiles2": {
        "total": "36",
        "ok": "36",
        "ko": "3"
    },
    "percentiles3": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "percentiles4": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 25,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "13",
        "ok": "12.5",
        "ko": "0.5"
    }
},
contents: {
"req_validac-o-es--40002687": {
        type: "REQUEST",
        name: "validações",
path: "validações",
pathFormatted: "req_validac-o-es--40002687",
stats: {
    "name": "validações",
    "numberOfRequests": {
        "total": "26",
        "ok": "25",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "3",
        "ok": "12",
        "ko": "3"
    },
    "maxResponseTime": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "meanResponseTime": {
        "total": "28",
        "ok": "29",
        "ko": "3"
    },
    "standardDeviation": {
        "total": "11",
        "ok": "9",
        "ko": "0"
    },
    "percentiles1": {
        "total": "35",
        "ok": "35",
        "ko": "3"
    },
    "percentiles2": {
        "total": "36",
        "ok": "36",
        "ko": "3"
    },
    "percentiles3": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "percentiles4": {
        "total": "37",
        "ok": "37",
        "ko": "3"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 25,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "13",
        "ok": "12.5",
        "ko": "0.5"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
